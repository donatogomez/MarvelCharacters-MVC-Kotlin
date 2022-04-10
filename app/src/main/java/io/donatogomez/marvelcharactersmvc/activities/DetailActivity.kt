package io.donatogomez.marvelcharactersmvc.activities

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import io.donatogomez.marvelcharactersmvc.R
import io.donatogomez.marvelcharactersmvc.domain.models.Character

class DetailActivity : AppCompatActivity() {
    companion object {
        const val KEY_DETAIL_EXTRAS = "KEY_DETAIL_EXTRAS"
    }

    private lateinit var characterImageView: ImageView
    private lateinit var characterDescriptionTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        configureViews()
        intent.extras?.getParcelable<Character>(KEY_DETAIL_EXTRAS)?.let {
            updateViews(it)
        }
    }

    private fun configureViews() {
        characterImageView = findViewById(R.id.ivCharacter)
        characterDescriptionTextView = findViewById(R.id.tvCharacterDescription)
    }

    private fun updateViews(character: Character) {
        val imageDrawableId = resources.getIdentifier(character.image, "drawable", packageName)

        characterImageView.setImageDrawable(
            androidx.appcompat.content.res.AppCompatResources.getDrawable(
                this,
                imageDrawableId
            )
        )

        title = character.name
        characterDescriptionTextView.text = character.description
    }
}