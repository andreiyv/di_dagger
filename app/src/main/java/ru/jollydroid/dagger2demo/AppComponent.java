package ru.jollydroid.dagger2demo;

import javax.inject.Singleton;

import dagger.Component;
/*

Компонент — это структура, которая связывает модули — поставщики объектов и классы — потребители этих объектов.

        На языке программирования компонент описывается как интерфейс. Реализация этого интерфейса будет создана автоматически.

        Этот интерфейс содержит список используемых модулей и список потребителей. Модули перечисляются в параметре аннотации @Component. Для каждого потребителя создается метод inject(), этот метод будет использоваться для передачи потребителю запрошенных объектов, пример будет ниже.

        Компонент AppComponent будет содержать два модуля (AppModule и AndroidModule) и поставлять объекты в нашу единственную активити:
*/
@Singleton
@Component(modules = {AppModule.class, AndroidModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
}
