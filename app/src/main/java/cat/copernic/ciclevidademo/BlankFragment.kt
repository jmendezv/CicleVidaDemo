package cat.copernic.ciclevidademo

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import cat.copernic.ciclevidademo.databinding.FragmentBlankBinding

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment : Fragment() {

    private lateinit var binding: FragmentBlankBinding

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "Fragment onActivityCreated()")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "Fragment onAttach()")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Fragment onCreate()")
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "Fragment onCreateView()")

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
        //return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "Fragment onViewCreated()")
        binding = FragmentBlankBinding.bind(view)
        binding.explicitButton.setOnClickListener {
            val intent = Intent(activity, MainActivity2::class.java)
            startActivity(intent)
        }
        binding.implicitButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://copernic.cat/")
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Fragment onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Fragment onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Fragment onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Fragment onStop()")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "Fragment onDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Fragment onDestroy()")
    }

}