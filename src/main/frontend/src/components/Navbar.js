import React from 'react';
import { Link } from 'react-router-dom';
import '../styles/Navbar.css';

function Navbar() {
  return (
    <header className="navbar">
      <h1>Bark Buddies Rescue</h1>
      <nav>
        <Link to="/" className="nav-link">Home</Link>
        <Link to="/login" className="nav-link">Login</Link>
      </nav>
    </header>
  );
}

export default Navbar;