package com.richer.showdemo.fragment;
/*
* 项目名： ShowDemo 
* 包名： com.richer.showdemo.fragment
* 文件名： ShowFragment
* 创建者： RicherQiao
* 创建时间： 1017/11/10 上午10:20
* 描述： 产品展示
*/

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.richer.showdemo.R;
import com.richer.showdemo.ui.DetailActivity;

import me.imid.swipebacklayout.lib.app.SwipeBackActivity;


public class ShowFragment extends Fragment{



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_show,null);

        //测试用
        Button button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), DetailActivity.class));
            }
        });

        return view;
    }
}
