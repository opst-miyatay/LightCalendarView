package jp.co.recruit_mp.android.lightcalendarview

/**
 * Created by alexilyin on 01.06.17.
 */
enum class ViewType {
    MONTH,
    WEEK;

    companion object {
        val ordinals = ViewType.values()
        fun fromOrdinal(ordinal: Int) = ordinals[ordinal]
    }
}