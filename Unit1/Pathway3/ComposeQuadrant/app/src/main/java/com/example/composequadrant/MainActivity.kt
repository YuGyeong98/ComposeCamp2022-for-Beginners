package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      ComposeQuadrantApp()
    }
  }
}

@Composable
fun ComposeQuadrantApp() {
  Column {
    Row(modifier = Modifier.weight(1f)) {
      ComposableInfoCard(
        title = "Text composable",
        description = "Displays text and follows Material Design guidelines.",
        backgroundColor = Color.Green,
        modifier = Modifier.weight(1f)
      )
      ComposableInfoCard(
        title = "Image composable",
        description = "Creates a composable that lays out and draws a given Painter class object.",
        backgroundColor = Color.Yellow,
        modifier = Modifier.weight(1f)
      )
    }
    Row(modifier = Modifier.weight(1f)) {
      ComposableInfoCard(
        title = "Row composable",
        description = "A layout composable that places its children in a horizontal sequence.",
        backgroundColor = Color.Cyan,
        modifier = Modifier.weight(1f)
      )
      ComposableInfoCard(
        title = "Column composable",
        description = "A layout composable that places its children in a vertical sequence.",
        backgroundColor = Color.LightGray,
        modifier = Modifier.weight(1f)
      )
    }
  }
}

@Composable
private fun ComposableInfoCard(
  title: String,
  description: String,
  backgroundColor: Color,
  modifier: Modifier = Modifier
) {
  Column(
    modifier = modifier
      .background(backgroundColor)
      .padding(16.dp),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
  ) {
    Text(
      text = title,
      fontWeight = FontWeight.Bold,
      modifier = modifier.padding(bottom = 16.dp),
    )
    Text(text = description, textAlign = TextAlign.Justify)
  }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  ComposeQuadrantApp()
}