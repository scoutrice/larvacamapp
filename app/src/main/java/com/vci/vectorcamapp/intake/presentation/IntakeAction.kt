package com.vci.vectorcamapp.intake.presentation

import com.vci.vectorcamapp.core.domain.model.Collector

sealed interface IntakeAction {
    data object ReturnToPreviousScreen : IntakeAction
    data object SubmitIntakeForm: IntakeAction
    data object RegisterMissingCollector : IntakeAction
    data class SelectCollector(val collector: Collector) : IntakeAction
    data class EnterHardwareId(val text: String): IntakeAction
    data class SelectDistrict(val district: String) : IntakeAction
    data class SelectVillageName(val villageName: String) : IntakeAction
    data class SelectHouseNumber(val houseNumber: String) : IntakeAction
    data class PickCollectionDate(val date: Long) : IntakeAction
    data class UpdateCollectionMethod(val collectionMethod: String) : IntakeAction
    data class UpdateSpecimenCondition(val specimenCondition: String) : IntakeAction
    data class EnterNotes(val text: String) : IntakeAction
    data object RetryLocation: IntakeAction
    data object ShowCollectionMethodTooltipDialog: IntakeAction
    data object HideCollectionMethodTooltipDialog: IntakeAction
    data class SelectAreaType(val areaType : String) : IntakeAction
}
