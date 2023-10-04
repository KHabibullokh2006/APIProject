package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.example.myapplication.ui.HomeFragment
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

//    var temp = 0.0
//    var windSpeed = 0.0
//    var url:String = "https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.main, HomeFragment())
            .commit()

//        var requestQueue = Volley.newRequestQueue(this)
//
//        val request = JsonObjectRequest(url,object : Response.Listener<JSONObject>{
//            override fun onResponse(response: JSONObject?) {
//                var weather = response!!.getJSONObject("main")
//                val wind = response.getJSONObject("wind")
//                temp = weather.getDouble("temp")
//                windSpeed = wind.getDouble("speed")
//                Log.d("TAG", temp.toString())
//
//            }
//        },
//            object : Response.ErrorListener{
//                override fun onErrorResponse(error: VolleyError?) {
//
//                    Log.d("TAG1", "onErrorResponse: $error")
//
//                }
//
//            })
//
//        requestQueue.add(request)



    }
}