package com.richer.showdemo.fragment;
/*
* 项目名： ShowDemo 
* 包名： com.richer.showdemo.fragment
* 文件名： SelectionFragment
* 创建者： RicherQiao
* 创建时间： 2017/11/10 上午10:20
* 描述： 文章精选
*/

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.richer.showdemo.R;

public class SelectionFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_selection,null);
        return view;
    }
}
