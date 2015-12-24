package com.example.hieunguyen725.bigo;

import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;

/**
 * Created by hieunguyen725 on 12/24/2015.
 */
public class DataStructureChildViewHolder extends ChildViewHolder {
    public TextView mOperationName;

    public DataStructureChildViewHolder(View itemView) {
        super(itemView);
        mOperationName = (TextView) itemView.findViewById(R.id.list_item_data_structure_child_name_tv);
    }
}