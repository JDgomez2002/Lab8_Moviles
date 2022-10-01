package gt.uvg.garageversion20

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import gt.uvg.garageversion20.databinding.FragmentDetailBinding
import gt.uvg.garageversion20.model.Car

class DetailFragment : Fragment() {
    val arg: DetailFragmentArgs by navArgs()
    private lateinit var recyclerView: RecyclerView
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment (para mostrarla)
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    //Obtenedor de
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val myPokemon = Car (arg.pokemonId, "unknown")
        Picasso.get().load(myPokemon.imageUrlFront).into(binding.imageView2)
        Picasso.get().load(myPokemon.imageUrlBack).into(binding.imageView3)
        Picasso.get().load(myPokemon.imageUrlShinnyBack).into(binding.imageView5)
        Picasso.get().load(myPokemon.imageUrlShinnyFront).into(binding.imageView4)
    }

    //destruir el binding cuando se regrese
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}