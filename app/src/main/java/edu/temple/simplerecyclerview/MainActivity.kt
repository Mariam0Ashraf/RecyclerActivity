package edu.temple.simplerecyclerview
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Step 1: Reference RecyclerView object
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // Step 2: Provide a LayoutManager
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Step 4: Provide a RecyclerView.Adapter
        val numbersArray = intArrayOf(10, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100, 110, 120, 130)
        recyclerView.adapter = NumberDisplayAdapter(numbersArray)
    }
}
