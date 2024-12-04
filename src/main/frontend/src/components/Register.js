import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import '../styles/Register.css';

function Register() {
  const [firstName, setFirstName] = useState('');
  const [lastName, setLastName] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [step, setStep] = useState(1); 
  const [otp, setOtp] = useState('');
  const navigate = useNavigate();

  // proceeds to otp after registration
  const handleRegister = (e) => {
    e.preventDefault();
    if (firstName && lastName && email && password) {
      setStep(2); 
    } else {
      alert('Please fill in all the fields.');
    }
  };

  // test otp
  const handleVerifyOtp = (e) => {
    e.preventDefault();
    const hardcodedOtp = '123456';

    // Directs to login page after successful sign up
    if (otp === hardcodedOtp) {
      alert('Registration successful!');
      navigate('/login');
    } else {
      alert('Invalid OTP. Please try again.');
    }
  };

  return (
    <div className="register-container">
      <div className="register-form">
        {step === 1 ? (
          <>
            <h2>Register</h2>
            <form onSubmit={handleRegister}>
              <div className="form-group">
                <label htmlFor="firstName">First Name:</label>
                <input
                  type="text"
                  id="firstName"
                  value={firstName}
                  onChange={(e) => setFirstName(e.target.value)}
                  required
                />
              </div>
              <div className="form-group">
                <label htmlFor="lastName">Last Name:</label>
                <input
                  type="text"
                  id="lastName"
                  value={lastName}
                  onChange={(e) => setLastName(e.target.value)}
                  required
                />
              </div>
              <div className="form-group">
                <label htmlFor="email">Email:</label>
                <input
                  type="email"
                  id="email"
                  value={email}
                  onChange={(e) => setEmail(e.target.value)}
                  required
                />
              </div>
              <div className="form-group">
                <label htmlFor="password">Password:</label>
                <input
                  type="password"
                  id="password"
                  value={password}
                  onChange={(e) => setPassword(e.target.value)}
                  required
                />
              </div>
              <button type="submit">Register</button>
            </form>
          </>
        ) : (
          <>
            <h2>Authenticate OTP</h2>
            <form onSubmit={handleVerifyOtp}>
              <div className="form-group">
                <label htmlFor="otp">Enter OTP:</label>
                <input
                  type="text"
                  id="otp"
                  value={otp}
                  onChange={(e) => setOtp(e.target.value)}
                  required
                />
              </div>
              <button type="submit">Verify OTP</button>
            </form>
          </>
        )}
      </div>
    </div>
  );
}

export default Register;
