package gt.uvg.garageversion20

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import gt.uvg.garageversion20.databinding.ItemPokemonViewBinding
import gt.uvg.garageversion20.model.Car

class PokemonListAdapter(private val pokemonList: List<Car>) : RecyclerView.Adapter<PokemonListAdapter.PokemonListHolder>() {

    inner class PokemonListHolder(val binding: ItemPokemonViewBinding) : RecyclerView.ViewHolder(binding.root){ //subclase de pokemon para el binding
        var name = binding.pokemonName ;
        var foto = binding.pokemonPhoto;
    }

    //Holders
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonListHolder {
        val binding = ItemPokemonViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PokemonListHolder(binding)
    }

    //propiedades
    override fun onBindViewHolder(holder: PokemonListHolder, position: Int) {
        val item = pokemonList.get(position)
        holder.name.text = item.name;
        Picasso.get().load(item.imageUrlFront).into(holder.foto)
        holder.itemView.setOnClickListener {
            val action =
                MainFragmentDirections.actionMainFragmentToDetailFragment(pokemonList.get(position).id)
            holder.binding.root.findNavController()
                .navigate(action)
        }
    }

    override fun getItemCount(): Int {
        // TODO
        return pokemonList.size
    }


}