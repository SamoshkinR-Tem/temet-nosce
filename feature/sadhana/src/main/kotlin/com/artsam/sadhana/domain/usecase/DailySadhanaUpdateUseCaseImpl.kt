package com.artsam.sadhana.domain.usecase

import com.artsam.sadhana.domain.model.DailyModel
import com.artsam.sadhana.domain.repository.SadhanaRepository

class DailySadhanaUpdateUseCaseImpl(
    private val repo: SadhanaRepository
) : DailySadhanaUpdateUseCase {

    override suspend fun invoke(value: DailyModel): Result<Unit> =
        repo.saveToDb(value)
}