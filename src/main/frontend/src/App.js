// Import necessary React components and hooks
import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Navbar from './components/Navbar';
import Home from './components/Home';
import Login from './components/Login';
import AdoptionPage from './components/AdoptionPage';
import './styles/App.css';
import DonationPage from './components/DonationPage';
import Register from './components/Register';

function App() {
  return (
    <Router>
      <div className="App">
        <Navbar />
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/login" element={<Login />} />
          <Route path="/register" element={<Register />} />
          <Route path="/adoptionpage" element={<AdoptionPage />} />
          <Route path="/donationpage" element={<DonationPage />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;