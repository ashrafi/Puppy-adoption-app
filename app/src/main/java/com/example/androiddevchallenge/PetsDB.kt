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
    private val puppy_img = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Iceland-1979445_%28cropped_3%29.jpg/1280px-Iceland-1979445_%28cropped_3%29.jpg"
    private val cat_img = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Iceland-1979445_%28cropped_3%29.jpg/1280px-Iceland-1979445_%28cropped_3%29.jpg"
    private val bear_img = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Iceland-1979445_%28cropped_3%29.jpg/1280px-Iceland-1979445_%28cropped_3%29.jpg"
    private val lion_img = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Iceland-1979445_%28cropped_3%29.jpg/1280px-Iceland-1979445_%28cropped_3%29.jpg"
    private val tiger_img = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Iceland-1979445_%28cropped_3%29.jpg/1280px-Iceland-1979445_%28cropped_3%29.jpg"
    private val dolphin_img = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Iceland-1979445_%28cropped_3%29.jpg/1280px-Iceland-1979445_%28cropped_3%29.jpg"
    private val fox_img = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Iceland-1979445_%28cropped_3%29.jpg/1280px-Iceland-1979445_%28cropped_3%29.jpg"

    init {
        petsList.add(Pets("Puppy", 2, puppy_img, "🐶", "small puppuy"))
        petsList.add(Pets("Cat", 2, cat_img, "🐱", "small cat"))
        petsList.add(Pets("Arctic Fox", 2, fox_img, "❄️🦊", "Loves to make compose apps"))
        petsList.add(Pets("Baby Bear", 2, bear_img, "🐻", "small bear"))
        petsList.add(Pets("Lion", 2, lion_img, "🦁", "small lion"))
        petsList.add(Pets("Tiger", 2, tiger_img, "🐯", "small tiger"))
        petsList.add(Pets("Surfing Dolphin", 2, dolphin_img, "🐬", "Loves to surf"))
    }

    fun getPetsList(): MutableList<Pets> {
        return petsList
    }
}
