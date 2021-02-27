/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

data class Pets(val name: String, val age: Int, val image: String, val icon: String, val discription: String)

class PetsDB {
    private val petsList = mutableListOf<Pets>()
    private val puppy_img = "https://cdn.pixabay.com/photo/2016/05/09/10/42/weimaraner-1381186_1280.jpg"
    private val cat_img = "https://cdn.pixabay.com/photo/2017/11/14/13/06/kitty-2948404_1280.jpg"
    private val bear_img = "https://cdn.pixabay.com/photo/2016/05/10/15/29/bear-1383980_1280.jpg"
    private val lion_img = "https://cdn.pixabay.com/photo/2014/12/12/19/45/lion-565820_1280.jpg"
    private val tiger_img = "https://cdn.pixabay.com/photo/2021/01/04/18/53/tiger-5888517_1280.jpg"
    private val dolphin_img = "https://cdn.pixabay.com/photo/2016/09/19/02/21/dolphin-1679468_1280.jpg"
    private val fox_img = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Iceland-1979445_%28cropped_3%29.jpg/1280px-Iceland-1979445_%28cropped_3%29.jpg"

    init {
        petsList.add(Pets("Surfing Dolphin", 2, dolphin_img, "🐬", "Loves to surf"))
        petsList.add(Pets("Tiny Tiger", 2, tiger_img, "🐯", "beautiful blue eyes"))
        petsList.add(Pets("Arctic Fox", 2, fox_img, "❄️🦊", "Loves to make compose apps"))
        petsList.add(Pets("Puppy", 2, puppy_img, "🐶", "Fluffy puppy looking for love"))
        petsList.add(Pets("Cat", 2, cat_img, "🐱", "Cat but might not get along with small flowers"))
        petsList.add(Pets("Big Bear", 2, bear_img, "🐻", "Sleepy bear"))
        petsList.add(Pets("Bay Lion", 2, lion_img, "🦁", "baby lion looking for a playmate"))
    }

    fun getPetsList(): MutableList<Pets> {
        return petsList
    }
}
