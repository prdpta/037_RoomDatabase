package com.example.roomdatabase_037.view.route

import com.example.roomdatabase_037.R

object DestinasiEditSiswa : DestinasiNavigasi {
    override val route = "item_edit"
    override val titleRes = R.string.edit_siswa
    const val itemIdArg = "IdSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}