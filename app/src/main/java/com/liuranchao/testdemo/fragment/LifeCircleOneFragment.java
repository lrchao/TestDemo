package com.liuranchao.testdemo.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.liuranchao.testdemo.R;
import com.liuranchao.testdemo.utils.LogUtil;


/**
 * One replace Two
 * 10-08 22:41:19.333 23613-23613/com.liuranchao.testdemo D/LifeCircleOneFragment: onPause
 * 10-08 22:41:19.333 23613-23613/com.liuranchao.testdemo D/LifeCircleOneFragment: onStop
 * 10-08 22:41:19.333 23613-23613/com.liuranchao.testdemo D/LifeCircleOneFragment: onDestroyView
 * 10-08 22:41:19.333 23613-23613/com.liuranchao.testdemo D/LifeCircleOneFragment: onDestroy
 * 10-08 22:41:19.333 23613-23613/com.liuranchao.testdemo D/LifeCircleOneFragment: onDetach
 * 10-08 22:41:19.333 23613-23613/com.liuranchao.testdemo D/LifeCircleTwoFragment: onAttach
 * 10-08 22:41:19.334 23613-23613/com.liuranchao.testdemo D/LifeCircleTwoFragment: onCreate
 * 10-08 22:41:19.334 23613-23613/com.liuranchao.testdemo D/LifeCircleTwoFragment: onCreateView
 * 10-08 22:41:19.335 23613-23613/com.liuranchao.testdemo D/LifeCircleTwoFragment: onActivityCreated
 * 10-08 22:41:19.335 23613-23613/com.liuranchao.testdemo D/LifeCircleTwoFragment: onStart
 * 10-08 22:41:19.335 23613-23613/com.liuranchao.testdemo D/LifeCircleTwoFragment: onResume
 * @author liuranchao
 */
public class LifeCircleOneFragment extends Fragment {

    private static final String TAG = "LifeCircleOneFragment";

    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LifeCircleFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LifeCircleOneFragment newInstance(String param1, String param2) {
        LifeCircleOneFragment fragment = new LifeCircleOneFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public LifeCircleOneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogUtil.d(TAG, "onCreate");
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    /**
     * 创建该Fragment的视图
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LogUtil.d(TAG, "onCreateView");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_life_circle_one, container, false);
    }


    /**
     * 当Fragment与Activity发生关联时调用。
     *
     * @param activity
     */
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        LogUtil.d(TAG, "onAttach");
    }

    /**
     * 当Activity的onCreate方法返回时调用
     *
     * @param savedInstanceState
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        LogUtil.d(TAG, "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        LogUtil.d(TAG, "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        LogUtil.d(TAG, "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        LogUtil.d(TAG, "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        LogUtil.d(TAG, "onStop");
    }

    /**
     * 与onCreateView想对应，当该Fragment的视图被移除时调用
     */
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        LogUtil.d(TAG, "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        LogUtil.d(TAG, "onDestroy");
    }

    /**
     * 与onAttach相对应，当Fragment与Activity关联被取消时调用
     */
    @Override
    public void onDetach() {
        super.onDetach();
        LogUtil.d(TAG, "onDetach");
    }


}
