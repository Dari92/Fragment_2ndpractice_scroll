package com.kotlincourse.a2nd_practice_fragments.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.kotlincourse.a2nd_practice_fragments.R
import com.kotlincourse.a2nd_practice_fragments.mFragmentNumber
import kotlinx.android.synthetic.main.fragment_blank.*

/**
 * A simple [Fragment] subclass.
 */
class BlankFragment : Fragment() {

    private var counter = 0

    private val myColors = arrayListOf(R.color.blue, R.color.green, R.color.yellow)
    private val myImages = arrayListOf(R.drawable.icon1, R.drawable.icon2, R.drawable.icon3)
    private val myText = arrayListOf(R.string.txt1, R.string.txt2, R.string.txt3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        counter = arguments?.getInt(mFragmentNumber)?:0
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) { //its called after OnCreatedView
        super.onViewCreated(view, savedInstanceState)

        view.setBackgroundColor(ContextCompat.getColor(view.context, myColors[counter]))
        textViewFragment.text = "Test: ".plus(counter + 1)
       //view.set(ContextCompat.getDrawable(view.context, myImages[counter]))
        imageViewFragment.setImageDrawable(ContextCompat.getDrawable(view.context, myImages[counter]))
        textViewBottom.setText(getString(myText[counter]))

    }

    companion object{
        fun newInstance (counter : Int?): BlankFragment {
            val fragment = BlankFragment()
            val args = Bundle()
            args.putInt(mFragmentNumber, counter!!)
            fragment.arguments = args
            return fragment
        }
    }

}
