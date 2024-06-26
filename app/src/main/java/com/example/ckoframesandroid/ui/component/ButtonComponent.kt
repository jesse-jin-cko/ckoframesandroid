package com.example.ckoframesandroid.ui.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ckoframesandroid.ui.theme.ButtonBorder
import com.example.ckoframesandroid.ui.theme.DarkBlue
import com.example.ckoframesandroid.ui.theme.LightBlue
import com.example.ckoframesandroid.ui.utils.CORNER_RADIUS_PERCENT

@Composable
internal fun ButtonComponent(buttonTitleId: Int, imageResourceID: Int, modifier: Modifier, onClick: () -> Unit) =
    Button(
        onClick = onClick,
        modifier = modifier,
        shape = RoundedCornerShape(CORNER_RADIUS_PERCENT),
        border = BorderStroke(width = 1.dp, color = ButtonBorder),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = DarkBlue,
        ),
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = imageResourceID),
                modifier = Modifier
                    .size(44.dp)
                    .background(
                        color = LightBlue,
                        shape = CircleShape,
                    ),
                contentScale = ContentScale.Inside,
                alignment = Alignment.Center,
                contentDescription = null,
            )
            Text(
                text = stringResource(id = buttonTitleId),
                modifier = Modifier.padding(start = 8.dp),
                fontSize = 12.sp,
            )
        }
    }