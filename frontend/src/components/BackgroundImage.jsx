import React from 'react';

const BackgroundImage = ({ imageUrl, children }) => {
  const styles = {
    backgroundImage: `url(${imageUrl})`,
    backgroundSize: 'cover',
    backgroundRepeat: 'no-repeat',
    backgroundPosition: 'center',
    width: '100%',
    height: '100vh', // You can adjust this to fit your needs
    position: 'relative', // Adjust positioning if needed
  };

  return (
    <div style={styles}>
      {children}
    </div>
  );
};

export default BackgroundImage;
