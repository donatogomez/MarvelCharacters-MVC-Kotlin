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

class CharactersGridAdapter(
    private var items: Characters,
    private val listener: ItemClickListener? = null
) :
    RecyclerView.Adapter<CharactersGridAdapter.CharacterGridViewHolder>() {

    class CharacterGridViewHolder(
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterGridViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.row_character, parent, false)
        return CharacterGridViewHolder(itemView, listener)
    }

    override fun onBindViewHolder(holder: CharacterGridViewHolder, position: Int) {
        holder.updateViews(items[position])
    }
}