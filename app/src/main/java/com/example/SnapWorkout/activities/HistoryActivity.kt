package com.example.SnapWorkout.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.SnapWorkout.WorkOutApp
import com.example.SnapWorkout.adapter.HistoryAdapter
import com.example.SnapWorkout.database.HistoryDao
import com.example.SnapWorkout.databinding.ActivityHistoryBinding
import kotlinx.coroutines.launch

class HistoryActivity : AppCompatActivity() {

    private var binding: ActivityHistoryBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHistoryBinding.inflate(layoutInflater)

        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbarHistoryActivity)

        val actionbar = supportActionBar//actionbar
        if (actionbar != null) {
            actionbar.setDisplayHomeAsUpEnabled(true)
            actionbar.title = "HISTORY"
        }

        binding?.toolbarHistoryActivity?.setNavigationOnClickListener {
            onBackPressed()
        }

        val dao = (application as WorkOutApp).db.historyDao()
        getAllCompletedDates(dao)
    }



    /**
     * Function is used to get the list exercise completed dates.
     */
    private fun getAllCompletedDates(historyDao: HistoryDao) {
        lifecycleScope.launch {
          historyDao.fetchALlDates().collect { allCompletedDatesList->

              if (allCompletedDatesList.isNotEmpty()) {
                  // Here if the List size is greater then 0 we will display the item in the recycler view or else we will show the text view that no data is available.
                  binding?.tvHistory?.visibility = View.VISIBLE
                  binding?.rvHistory?.visibility = View.VISIBLE
                  binding?.tvNoDataAvailable?.visibility = View.GONE

                  // Creates a vertical Layout Manager
                  binding?.rvHistory?.layoutManager = LinearLayoutManager(this@HistoryActivity)

                  // History adapter is initialized and the list is passed in the param.
                  val dates = ArrayList<String>()
                  for (date in allCompletedDatesList){
                      dates.add(date.date)
                  }
                  val historyAdapter = HistoryAdapter(ArrayList(dates))


                  binding?.rvHistory?.adapter = historyAdapter
              } else {
                  binding?.tvHistory?.visibility = View.GONE
                  binding?.rvHistory?.visibility = View.GONE
                  binding?.tvNoDataAvailable?.visibility = View.VISIBLE
              }

          }
       }

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}