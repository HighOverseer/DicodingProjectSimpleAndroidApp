package com.fajar.dicodingprojectsimpleandroidapp.DataModel

import android.os.Parcel
import android.os.Parcelable

data class UKM(
    val logo:Int,
    val nama:String,
    val deskripsi:String,
    val visi:String,
    val misi:String,
    var favorite:Int,
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt()!!
    ) {
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.apply {
            writeInt(logo)
            writeString(nama)
            writeString(deskripsi)
            writeString(visi)
            writeString(misi)
            writeInt(favorite)
        }
    }

    companion object CREATOR : Parcelable.Creator<UKM> {
        override fun createFromParcel(parcel: Parcel): UKM {
            return UKM(parcel)
        }

        override fun newArray(size: Int): Array<UKM?> {
            return arrayOfNulls(size)
        }
    }
}