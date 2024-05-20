package com.example.testapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.R
import com.example.testapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Encontre o RecyclerView no layout da fragment
        val recyclerView = binding.recyclerView

        // Defina o layout manager (por exemplo, LinearLayoutManager)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Crie uma lista de lojas (substitua com seus dados reais)
        val listaDeLojas = mutableListOf<Loja>(
            Loja("Giliardo Júlio", R.drawable.giliardo, 5.0),
            Loja("Loja do Zeca", R.drawable.zefelipe, 4.0),
            Loja("Pinheiros", R.drawable.jere, 1.8),
            Loja("Teste", R.drawable.loja1, 4.5),
            Loja("Loja do grego", R.drawable.loja2, 4.0),
            Loja("Eletrolux", R.drawable.loja3, 4.8),
            Loja("Gili das Trevas", R.drawable.giliardo, 5.0),
            Loja("Loja do Zeca", R.drawable.zefelipe, 4.0),
            Loja("Pinheiros & Farias", R.drawable.jere, 1.8),
            Loja("Teste", R.drawable.loja1, 4.5),
            Loja("Loja do grego", R.drawable.loja2, 4.0),
            Loja("Eletrolux", R.drawable.loja3, 4.8),
            // Adicione mais lojas conforme necessário
        )

        // Crie um adaptador e passe a lista de lojas
        val adapter = LojaAdapter(listaDeLojas, this)

        // Associe o adaptador ao RecyclerView
        recyclerView.adapter = adapter

        return root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}


class LojaAdapter(
    private val listaDeLojas: List<Loja>,
    private val fragment: Fragment
) :
    RecyclerView.Adapter<LojaAdapter.LojaViewHolder>() {

    // Classe ViewHolder para os itens da lista
    class LojaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Inicialize as views dentro do item da lista
        val storeImageView: ImageView = itemView.findViewById(R.id.storeImageView)
        val storeNameTextView: TextView = itemView.findViewById(R.id.storeNameTextView)
        val storeRatingTextView: TextView = itemView.findViewById(R.id.storeRatingTextView)
        val storeLayout: LinearLayout = itemView.findViewById(R.id.layoutstore)
    }

    // Crie a view do item da lista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LojaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.store_item_layout, parent, false)
        return LojaViewHolder(view)
    }

    // Associe os dados aos elementos da view do item
    override fun onBindViewHolder(holder: LojaViewHolder, position: Int) {
        val loja = listaDeLojas[position]
        holder.storeImageView.setImageResource(loja.imagem)
        holder.storeNameTextView.text = loja.nome
        holder.storeRatingTextView.text = "Avaliação: ${loja.avaliacao}"

        val backgroundColor = if (position % 2 == 0) {
            holder.itemView.context.getColor(R.color.cinzaescuro)
        } else {
            holder.itemView.context.getColor(R.color.cinzaclaro)
        }
        holder.itemView.setBackgroundColor(backgroundColor)

        // Configurar o clique na visualização da loja
        holder.storeLayout.setOnClickListener {
            fragment.findNavController().navigate(R.id.nav_gallery)
        }
    }

    // Retorne o número total de itens na lista
    override fun getItemCount(): Int {
        return listaDeLojas.size
    }
}


data class Loja(val nome: String, val imagem: Int, val avaliacao: Double)

