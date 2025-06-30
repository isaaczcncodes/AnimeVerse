import AnimeCard from '../components/AnimeCard';

const mockAnimes = [
  { id: 1, name: 'Naruto', image: 'https://via.placeholder.com/200' },
  { id: 2, name: 'One Piece', image: 'https://via.placeholder.com/200' },
  { id: 3, name: 'Attack on Titan', image: 'https://via.placeholder.com/200' },
];

function Home() {
  return (
    <div style={{ display: 'flex', gap: '20px', flexWrap: 'wrap' }}>
      {mockAnimes.map(anime => (
        <AnimeCard key={anime.id} name={anime.name} image={anime.image} />
      ))}
    </div>
  );
}

export default Home;