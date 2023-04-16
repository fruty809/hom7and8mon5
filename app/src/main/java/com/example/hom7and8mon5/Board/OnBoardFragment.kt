import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.hom24mon5.R
import com.example.hom24mon5.databinding.FragmentOnBoardingBinding
import com.example.hom7and8mon5.Board.Adapter
import com.example.hom7and8mon5.Pref.Pref
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class Boarding: Fragment() {
    private lateinit var adapter: Adapter
    private lateinit var binding: FragmentOnBoardingBinding
    @Inject
    lateinit var pref: Pref



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnBoardingBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pref = Pref(requireContext())

        if (pref.isUserSeen()){
            findNavController().navigate(R.id.mainFragment)
        }
        val adapter1 = Adapter(this::onClick)
        val dotsIndicator = binding.dotsIndicator
        val viewPager = binding.pager
        viewPager.adapter = adapter1
        dotsIndicator.attachTo(viewPager)
        viewPager.adapter = adapter1
        binding.pager.adapter = adapter1

    }
    fun onClick(){
        findNavController().navigateUp()
        pref.userSeen()
    }
}