import React, { useState } from 'react';
import './App.css';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = async () => {
    // Implement login logic here
    // For now, just toggle the state
    setIsLoggedIn(!isLoggedIn);
  };

  return (
    <div className="App">
      <header className="App-header">
        <h1>Bark Buddies Rescue</h1>
        <button onClick={handleLogin} className="login-button">
          {isLoggedIn ? 'Logout' : 'Login'}
        </button>
      </header>
      <main>
        <h2>Welcome to Bark Buddies Rescue</h2>
        <p>We help dogs find their forever homes!</p>
      </main>
    </div>
  );
}

export default App;