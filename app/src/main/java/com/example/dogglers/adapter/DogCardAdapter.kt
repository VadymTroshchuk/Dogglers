/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.const.Layout
import com.example.dogglers.data.DataSource

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class DogCardAdapter(
    private val context: Context?,
    private val layout: Int
): RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {


    private val data = DataSource.dogs


    /**
     * Initialize view elements
     */
    class DogCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
      val dogImage : ImageView = view!!.findViewById(/* id = */ R.id.dog_image)
        val dogName : ImageView = view!!.findViewById(/* id = */ R.id.dog_name)
        val dogAge : ImageView = view!!.findViewById(/* id = */ R.id.dog_age)
        val dogHobby : ImageView = view!!.findViewById(/* id = */ R.id.dog_hobby)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {


        val adapterLayout = when (layout) {
            Layout.VERTICAL ->  {
                LayoutInflater.from(parent.context)
                .inflate(R.layout.vertical_horizontal_list_item, parent, false )

            }

            Layout.HORIZONTAL -> {
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.vertical_horizontal_list_item, parent, false )
            }

            else -> {
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.grid_list_item, parent, false )
            }
        }


        return DogCardViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int = data.size //

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        // TODO: Get the data at the current position
        // TODO: Set the image resource for the current dog
        // TODO: Set the text for the current dog's name
        // TODO: Set the text for the current dog's age
        val resources = context?.resources
        // TODO: Set the text for the current dog's hobbies by passing the hobbies to the
        //  R.string.dog_hobbies string constant.
        //  Passing an argument to the string resource looks like:
        //  resources?.getString(R.string.dog_hobbies, dog.hobbies)
    }
}
