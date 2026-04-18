package com.vci.vectorcamapp.intake.domain.model

object IntakeDropdownOptions {

    enum class CollectionMethodOption(val label: String) {
        OVITRAP("Ovitrap"),
        MANUAL_COLLECTION("Manual collection"),
        INSECTARY("Insectary"),
        OTHER("Other")
    }

    enum class SpecimenConditionOption(val label: String) {
        FRESH("Fresh"),
        DESSICATED("Dessicated"),
        OTHER("Other")
    }

    enum class AreaType(val label: String) {
        RURAL("Rural"),
        URBAN("Urban")
    }
}
