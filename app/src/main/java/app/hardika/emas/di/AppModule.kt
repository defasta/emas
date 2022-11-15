package app.hardika.emas.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

//    @Singleton
//    @Provides
//    fun provideAuthApi(
//        remoteDataSource: RemoteDataSource,
//        @ApplicationContext context: Context
//    ): Api {
//        return remoteDataSource.buildApi(Api::class.java, context)
//    }

}