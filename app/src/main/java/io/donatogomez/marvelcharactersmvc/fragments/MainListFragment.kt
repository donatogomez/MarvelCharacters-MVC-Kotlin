package io.donatogomez.marvelcharactersmvc.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.donatogomez.marvelcharactersmvc.R
import io.donatogomez.marvelcharactersmvc.activities.DetailActivity
import io.donatogomez.marvelcharactersmvc.activities.DetailActivity.Companion.KEY_DETAIL_EXTRAS
import io.donatogomez.marvelcharactersmvc.adapters.CharactersListAdapter
import io.donatogomez.marvelcharactersmvc.adapters.ItemClickListener
import io.donatogomez.marvelcharactersmvc.domain.models.Character
import io.donatogomez.marvelcharactersmvc.domain.models.Characters
import io.donatogomez.marvelcharactersmvc.domain.repository.HeroesRepository

class MainListFragment : Fragment() {

    private var characters: Characters? = null
    private lateinit var recyclerView: RecyclerView

    private val itemClickListener = object : ItemClickListener {
        override fun onItemClickListener(item: Character) {
            startActivity(
                Intent(activity, DetailActivity::class.java).apply {
                    putExtra(KEY_DETAIL_EXTRAS, item)
                }
            )
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        configureViews(view)
    }

    private fun configureViews(view: View) {
        recyclerView = view.findViewById<RecyclerView>(R.id.listRecyclerView).apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = CharactersListAdapter(
                characters ?: arrayListOf(),
                itemClickListener
            )
        }
    }

    private fun loadData() {
        characters = HeroesRepository.characterSample
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            MainListFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}