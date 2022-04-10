package io.donatogomez.marvelcharactersmvc.domain.repository

import io.donatogomez.marvelcharactersmvc.domain.models.Character
import io.donatogomez.marvelcharactersmvc.domain.models.Characters

object HeroesRepository {
    val characterSample: Characters
        get() {
            return arrayListOf(
                Character(
                    "img_america_captain",
                    "Captain America",
                    "Recipient of the Super Soldier serum, World War II hero Steve Rogers fights for American ideals as one of the world’s mightiest heroes and the leader of the Avengers.",
                    true
                ),
                Character(
                    "img_black_panther",
                    "Black Panther",
                    "T’Challa is the king of the secretive and highly advanced African nation of Wakanda - as well as the powerful warrior known as the Black Panther.",
                    true
                ),
                Character(
                    "img_black_widow",
                    "Black Widow",
                    "A deadly assassin is closing in on Natasha Romanoff. Now Natasha must reunite with an unlikely group of spies from her past in order to survive and stop a lethal force from being unleashed on the world.",
                    true
                ),
                Character(
                    "img_dr_strange",
                    "Doctor Strange",
                    "Once a highly successful, yet notably egotistical, surgeon, Doctor Stephen Strange endured a terrible accident that led him to evolve in ways he could have never foreseen.",
                    true
                ),
                Character(
                    "img_gamora",
                    "Gamora",
                    "Raised by Thanos to be a living weapon, Gamora seeks redemption as a member of the Guardians of the Galaxy, putting her extraordinary fighting abilities to good use.",
                    true
                ),
                Character(
                    "img_hulk",
                    "Hulk",
                    "Exposed to heavy doses of gamma radiation, scientist Bruce Banner transforms into the mean, green rage machine called the Hulk.",
                    true
                ),
                Character(
                    "img_ironman",
                    "Iron Man",
                    "Genius. Billionaire. Philanthropist. Tony Stark's confidence is only matched by his high-flying abilities as the hero called Iron Man.",
                    true
                ),
                Character(
                    "img_marvel_captain",
                    "Captain Marvel",
                    "Carol Danvers becomes one of the universe's most powerful heroes when Earth is caught in the middle of a galactic war between two alien races.",
                    true
                ),
                Character(
                    "img_spiderman",
                    "Spider-Man",
                    "Bitten by a radioactive spider, Peter Parker’s arachnid abilities give him amazing powers he uses to help others, while his personal life continues to offer plenty of obstacles.",
                    true
                ),
                Character(
                    "img_thor",
                    "Thor",
                    "The son of Odin uses his mighty abilities as the God of Thunder to protect his home Asgard and planet Earth alike.",
                    true
                )
            )
        }
}