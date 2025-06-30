import './AnimeCard.css';

function AnimeCard({ name, image }) {
  return (
    <div className="anime-card">
      <img src={image} alt={name} />
      <h3>{name}</h3>
    </div>
  );
}

export default AnimeCard;
