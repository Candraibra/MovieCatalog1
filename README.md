# Submission 1: Aplikasi Movie Catalogue

1. Menggunakan Listview Untuk Menampilkan Daftar Film Dengan Jumlah Minimal 10 Item.

3. Menampilkan Poster Dan Informasi Film Pada Halaman Detail Film.

5. Menggunakan Parcelable Sebagai Interface Dari Obyek Data Yang Akan Dikirimkan Antar Activity.

7. Menerapkan Mekanisme Intent Dengan Baik Dan Benar.

9. Masih Menggunakan Data Pada Folder Drawable

### For Load Item From strings.xml Use This
```java
    private void prepare() {
        dataJudul = getResources().getStringArray(R.array.data_judul);
        dataSinopsis = getResources().getStringArray(R.array.data_sinopsis);
        dataPoster = getResources().obtainTypedArray(R.array.data_poster);
    }
```
###  This For Add Item To Variable
```java
private String[] dataJudul
private String[] dataSinopsis;
private TypedArray dataPoster;

 private void addItem() {
        movies = new ArrayList<>();

        for (int i = 0; i < dataJudul.length; i++) {
            Movie movie = new Movie();
            movie.setPoster(dataPoster.getResourceId(i, -1));
            movie.setJudul(dataJudul[i]);
            movie.setSinopsis(dataSinopsis[i]);
            movies.add(movie);
        }

        adapter.setMovies(movies);
    }
```
### To Set Adapter Use This
```java
adapter = new MovieAdapter(this);
listView = findViewById(R.id.lv_list_movie);
listView.setAdapter(adapter);
```
### And This For Action onItemClick
```java
 listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_MOVIE, movies.get(i));
                startActivity(intent);
            }
        });
```
> Ini Merupakan Awal Dari Pembelajaran Saya Pda Aplikasi Android Native Dengan Menggunakan Listview Dan Memulai Dengan Menulis Baris Demi Baris Guna Memahami Alur Aplikasi
