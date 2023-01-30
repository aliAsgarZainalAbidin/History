package com.selayar.history.xml.fragment.home

import androidx.cardview.widget.CardView
import com.selayar.history.xml.Models.WisataSejarah

interface WisataOnClickListener {
    fun WisataOnClickListener(wisataSejarah: WisataSejarah, position : Int, root: CardView){}
}