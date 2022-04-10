package io.donatogomez.marvelcharactersmvc.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView
import io.donatogomez.marvelcharactersmvc.R
import io.donatogomez.marvelcharactersmvc.domain.models.Character
import io.donatogomez.marvelcharactersmvc.domain.models.Characters


interface ItemClickListener {
    fun onItemClickListener(item: Character)
}

class CharactersListAdapter(
    private val items: Characters,
    private val listener: ItemClickListener? = null
) : RecyclerView.Adapter<CharactersListAdapter.CharactersListViewHolder>() {

    class CharactersListViewHolder(
        private val view: View,
        private val listener: ItemClickListener? = null
    ) : RecyclerView.ViewHolder(view) {
        private var characterImageView = view.findViewById<ImageView>(R.id.ivCharacter)
        private var characterNameTextView = view.findViewById<TextView>(R.id.tvCharacterName)


        fun updateViews(item: Character) {
            view.setOnClickListener {
                listener?.onItemClickListener(item)
            }

            with(view.context) {
                val imageDrawableId = resources.getIdentifier(item.image, "drawable", packageName)

                characterImageView.setImageDrawable(
                    AppCompatResources.getDrawable(
                        this,
                        imageDrawableId
                    )
                )
            }

            characterNameTextView.text = item.name

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersListViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.row_character, parent, false)
        return CharactersListViewHolder(itemView, listener)
    }

    override fun onBindViewHolder(holder: CharactersListViewHolder, position: Int) {
        holder.updateViews(items[position])
    }
}