package ru.jollydroid.dagger2demo;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
// Модуль — это класс, описывающий Dagger'у, как создавать различные объекты. Каждому создаваемому объекту соответствует один метод с аннотацией @Provides.
@Module
public class AppModule {
    @Provides
    @Singleton
    MyPreferences providesMyPreferences(Context context) {
        return new MyPreferences(context);
    }
}