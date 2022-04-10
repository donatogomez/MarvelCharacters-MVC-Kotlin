package io.donatogomez.marvelcharactersmvc.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.donatogomez.marvelcharactersmvc.R
import io.donatogomez.marvelcharactersmvc.activities.DetailActivity
import io.donatogomez.marvelcharactersmvc.adapters.CharactersGridAdapter
import io.donatogomez.marvelcharactersmvc.adapters.ItemClickListener
import io.donatogomez.marvelcharactersmvc.domain.models.Character
import io.donatogomez.marvelcharactersmvc.domain.models.Characters
import io.donatogomez.marvelcharactersmvc.domain.repository.VillainsRepository

class MainGridFragment : Fragment() {

    private var characters: Characters? = null
    private lateinit var recyclerView: RecyclerView

    private val itemClickListener = object : ItemClickListener {
        override fun onItemClickListener(item: Character) {
            startActivity(
                Intent(activity, DetailActivity::class.java).apply {
                    putExtra(DetailActivity.KEY_DETAIL_EXTRAS, item)
                }
            )
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_grid, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        configureViews(view)
    }

    private fun configureViews(view: View) {
        recyclerView = view.findViewById<RecyclerView>(R.id.gridRecyclerView).apply {
            layoutManager = GridLayoutManager(activity, 1)
            adapter = CharactersGridAdapter(characters ?: arrayListOf(), itemClickListener)
        }
    }

    private fun loadData() {
        characters = VillainsRepository.characterSample
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            MainGridFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}