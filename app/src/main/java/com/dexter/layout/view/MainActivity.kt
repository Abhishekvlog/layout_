package com.dexter.layout.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.dexter.layout.R
import com.dexter.layout.adapter.PosterAdapter
import com.dexter.layout.data.PosterData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var PosterArray : Array<Int>
    private lateinit var HeadlineArray : Array<String>
    private lateinit var newList : ArrayList<PosterData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        PosterArray = arrayOf(
            R.drawable.bac1,
            R.drawable.background,
            R.drawable.bak3,
            R.drawable.bak4
        )

        HeadlineArray = arrayOf(
            "Bring Dedicates \$100 million to victims of 732 Max crashes",
            "Bring Dedicates \$100 million to victims of 732 Max crashes",
            "Bring Dedicates \$100 million to victims of 732 Max crashes",
            "Bring Dedicates \$100 million to victims of 732 Max crashes"
        )

        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.setHasFixedSize(true)

        newList = arrayListOf<PosterData>()
        getData()
    }

    private fun getData() {
        for (i in PosterArray.indices){

            val News = PosterData(PosterArray[i], HeadlineArray[i])
            newList.add(News)

        }

        mRecyclerView.adapter = PosterAdapter(newList)

    }
}