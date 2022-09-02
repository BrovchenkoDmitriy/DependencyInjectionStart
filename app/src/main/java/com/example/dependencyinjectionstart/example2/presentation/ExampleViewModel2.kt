package com.example.dependencyinjectionstart.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionstart.example2.di.IdQualifier
import com.example.dependencyinjectionstart.example2.domain.ExampleRepository
import com.example.dependencyinjectionstart.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel2 @Inject constructor(
    private val repository: ExampleRepository,
    @IdQualifier private val id:String
): ViewModel() {

    fun method() {
        repository.method()
        Log.d("EXAMPLE_VM","ExampleViewModel2 $this $id")
    }
}
