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
package com.example.androiddevchallenge.ui.theme

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.PetsDB
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun DetailUI(navController: NavHostController, petsDB: PetsDB, petID: Int?) {

    val petId = petID ?: 0
    val pet = petsDB.getPetsList()[petId]

    Card(
        shape = RoundedCornerShape(4.dp),
        elevation = 20.dp,
        // backgroundColor =  if (alarmIndex.value == index) colors[index % colors.size] else Color.LightGray,
        // backgroundColor = colors[index % colors.size],
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .clickable(
                onClick = {
                    // checkOKViewModel.setCurrCheckOK(alert)
                    // alarmIndex.value = index
                    // sendCmd(ACTION_INITIALIZE_DATA)
                    // Log.v(TAG, "I got clicked $index / alarmIndex.value")
                    // add navigation
                    navController.navigate("main")
                }
            )
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CoilImage(
                data = pet.image,
                contentDescription = "description of the image"
            )
            Text(
                pet.icon,
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 45.sp,
                    textAlign = TextAlign.Center
                ) // , modifier = Modifier.padding(16.dp)
            )

            Text(
                pet.name,
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Center
                ) // , modifier = Modifier.padding(16.dp)
            )
        }
    }
}
