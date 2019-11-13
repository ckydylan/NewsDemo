package com.example.newsdemo.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.fastjson.JSON;
import com.example.newsdemo.R;
import com.example.newsdemo.adapter.NewsAdapter;
import com.example.newsdemo.bean.News;
import com.example.newsdemo.bean.News.*;
import com.example.newsdemo.bean.News.ResultBean.DataBean;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @author cky
 * date 2019-11-04
 */
public class NewsFragment extends Fragment {
    RecyclerView rvNews;

    private List<DataBean> list;
    private String json = null;
    private News news;
    private String type;

    public NewsFragment(String type) {
        this.type = type;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        rvNews = view.findViewById(R.id.rv_news);
        //设置请求一次
        if (news != null) {
            setAdapter();
        }else {
            getDataAsync(type);
        }
    }

    /**
     * http请求
     * 获得数据
     * @param type 请求新闻的类型
     */
    private void getDataAsync(String type) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://v.juhe.cn/toutiao/index?type="+type+"&key=0954dfe4cf05dda5d80d3fd166941b10")
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("httperror",e.getMessage()+"");
            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if(response.isSuccessful()){
                    if (response.body() != null){
                        //这里的string()方法只能使用一次 否则会报错
                        json = response.body().string();
                        parseJson(json);
                        //获取的内容在日志中
                        Log.d("json","response.body().string()=="+json);
                    }
                }
            }
        });
    }

    /**
     * 解析数据放入list
     * @param json 需要解析的json
     */
    private void parseJson(String json){
        news = JSON.parseObject(json, News.class);
        ResultBean resultBean = news.getResult();
        list = resultBean.getData();

        if (getActivity() != null) {
            getActivity().runOnUiThread(this::setAdapter);
        }
    }

    private void setAdapter(){
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        rvNews.setLayoutManager(manager);
        NewsAdapter adapter = new NewsAdapter(list, getContext());
        rvNews.setAdapter(adapter);
    }
}
