package com.godaddy.android.colorpicker

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

internal fun DrawScope.drawHorizontalSelector(amount: Float) {
    val halfIndicatorThickness = 4.dp.toPx()
    val strokeThickness = 1.dp.toPx()

    val offset =
        Offset(
            x = amount - halfIndicatorThickness,
            y = -strokeThickness
        )

    val selectionSize = Size(halfIndicatorThickness * 2f, this.size.height + strokeThickness * 2)
    drawSelectorIndicator(
        offset = offset,
        selectionSize = selectionSize,
        strokeThicknessPx = strokeThickness
    )
}

internal fun DrawScope.drawVerticalSelector(amount: Float) {
    val halfIndicatorThickness = 4.dp.toPx()
    val strokeThickness = 1.dp.toPx()

    val offset =
        Offset(
            y = amount - halfIndicatorThickness,
            x = -strokeThickness
        )
    val selectionSize = Size(this.size.width + strokeThickness * 2, halfIndicatorThickness * 2f)
    drawSelectorIndicator(
        offset = offset,
        selectionSize = selectionSize,
        strokeThicknessPx = strokeThickness
    )
}

internal fun DrawScope.drawSelectorIndicator(
    offset: Offset,
    selectionSize: Size,
    strokeThicknessPx: Float
) {
    val circleSize = 14.dp.toPx()

    // Calculate the center of the circle
    val center = Offset(
        x = offset.x + circleSize / 2f,
        y = offset.y + circleSize / 2f
    )

    // Draw the circle with the color #425669
    drawCircle(
        color = Color(0xFF425669),
        radius = circleSize / 2f,
        center = center
    )

}


internal fun Size.inset(amount: Float): Size {
    return Size(width - amount, height - amount)
}
