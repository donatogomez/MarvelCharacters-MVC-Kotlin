package io.donatogomez.marvelcharactersmvc.domain.repository

import io.donatogomez.marvelcharactersmvc.domain.models.Character
import io.donatogomez.marvelcharactersmvc.domain.models.Characters

object VillainsRepository {
    val characterSample: Characters
        get() {
            return arrayListOf(
                Character(
                    "img_yon_rogg",
                    "Yon-Rogg",
                    "As the leader of a squad of elite Kree soldiers, Yon-Rogg takes newly-recruited Carol Danvers under his wing and trains her.",
                    false
                ),
                Character(
                    "img_dormammu",
                    "Dormammu",
                    "Originating in the aptly-named Dark Dimension, this incredibly powerful being has ominous plans for Earth and those who live there.",
                    false
                ),
                Character(
                    "img_ego",
                    "Ego",
                    "Ego, a powerful Celestial being and intergalactic explorer, traveled the cosmos in search of reuniting with his long-lost biological son, Peter Quill, and embarking on his most important mission together as father and son.",
                    false
                ),
                Character(
                    "img_hela",
                    "Hela",
                    "Hela, Odin’s first born and sister to the Asgardian princes, seeks her place as the rightful heir of Asgard following the death of Odin and her release from imprisonment.",
                    false
                ),
                Character(
                    "img_ivan_vanko",
                    "Whiplash",
                    "Russian physicist and the son of former Stark Industries employee Anton Vanko. Following the death of his father, Ivan set out for revenge on Tony Stark, as he blamed the Stark family for the humiliation that was brought upon his father.",
                    false
                ),
                Character(
                    "img_red_skull",
                    "Red Skull",
                    "Rising to power during World War II, Johann Schmidt become one of Earth’s most dangerous threats and one of Captain America’s greatest enemies.",
                    false
                ),
                Character(
                    "img_malekith",
                    "Malekith",
                    "The Dark Elf of Svartalfheim, Malekith uses his magic and trickery to bring war to all of the Ten Realms.",
                    false
                ),
                Character(
                    "img_ronan",
                    "Ronan",
                    "As a cruel and fanatical member of the Kree race, Ronan double-crossed Thanos in an attempt to keep the Power Stone for himself.",
                    false
                ),
                Character(
                    "img_thanos",
                    "Thanos",
                    "The Mad Titan Thanos quests across the universe in search of the Infinity Stones, intending to use their limitless power for shocking purposes.",
                    false
                ),
                Character(
                    "img_ultron",
                    "Ultron",
                    "An artificial intelligence with access to all the data in the world, Ultron decides that the best way to save the Earth is to destroy all the people on it to make way for a new race of highly intelligent robotic lifeforms.",
                    false
                )
            )
        }
}