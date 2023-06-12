package com.example.whoami

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.whoami.adapter.dailyAdapter
import com.example.whoami.datamodel.friendslistModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DailyFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DailyFragment : Fragment() {

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var adapter : dailyAdapter
    private lateinit var recyclerView : RecyclerView
    private lateinit var friendArraylist : ArrayList<friendslistModel>

    lateinit var imageId : Array<Int>
    lateinit var textId : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.fragment_daily, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DailyFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DailyFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        recyclerView = view.findViewById(R.id.friendlist)
        recyclerView.layoutManager= layoutManager
        adapter = dailyAdapter(friendArraylist)

    }

    private fun dataInitialize(){

        friendArraylist = arrayListOf<friendslistModel>()

        imageId = arrayOf(
            R.drawable.adi,
            R.drawable.arbi,
            R.drawable.daffa,
            R.drawable.diva,
            R.drawable.hasbi
        )

        textId = arrayOf(
            getString(R.string.nama1),
            getString(R.string.nama2),
            getString(R.string.nama3),
            getString(R.string.nama4),
            getString(R.string.nama5)

        )

        for (i in imageId.indices){
            val friend = friendslistModel(imageId[i],textId[i])
            friendArraylist.add(friend)
        }


    }
}