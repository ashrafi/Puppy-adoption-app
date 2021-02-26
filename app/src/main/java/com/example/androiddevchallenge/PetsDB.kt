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

data class Pets(val name: String, val age: Int, val image: String, val discription: String)

class PetsDB {
    private val petsList = mutableListOf<Pets>()

    init {
        petsList.add(Pets("Puppy", 2, "🐶", "small puppuy"))
        petsList.add(Pets("Cat", 2, "🐱", "small cat"))
        petsList.add(Pets("Arctic Fox", 2, "❄️🦊", "Loves to make compose apps"))
        petsList.add(Pets("Baby Bear", 2, "🐻", "small bear"))
        petsList.add(Pets("Lion", 2, "🦁", "small lion"))
        petsList.add(Pets("Tiger", 2, "🐯", "small tiger"))
        petsList.add(Pets("Surfing Dolphin", 2, "🐬", "Loves to surf"))
    }

    fun getPetsList(): MutableList<Pets> {
        return petsList
    }
}
