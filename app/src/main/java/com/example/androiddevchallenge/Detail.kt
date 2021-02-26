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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.PetsDB

@Composable
fun DetailUI(navController: NavHostController, petsDB: PetsDB) {
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
    }
}
