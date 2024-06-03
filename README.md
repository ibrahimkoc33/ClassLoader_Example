1- src klasörüne girin.
2- Terminale şu komutları yazın.
3- javac Test.java
4- jar cf test.jar Test.class
5- javac Main.java
6- java Main

Ardından outputa 10 kere "Initializing class Test" yazısı bastırılır.
Bu da bize static değişken veya sınıfların farklı classLoaderlar tarafından yüklenerek birden fazla kez oluşturulabileceğini gösterir.
