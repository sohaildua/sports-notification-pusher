import React from 'react';
import { motion } from 'framer-motion'; // Import motion from Framer Motion

function FootballCard({ name, emblem, startDate, endDate, matchDay }) {
  // Determine the background image
  const backgroundImage = emblem ? emblem : "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRXxV-UCZ00bszpOXxjyBlnNZvlq-rXrkG5pA&usqp=CAU";

  return (
    <motion.div
      initial={{ scale: 0, opacity: 0 }} // Initial animation state
      animate={{ scale: 1, opacity: 1 }} // Animation when component mounts
      transition={{ duration: 0.5 }} // Animation duration
      className="w-full max-w-xl bg-white shadow-lg rounded-lg overflow-hidden mx-auto my-8 text-gray-800"
    >
      <div className="bg-cover bg-center h-60" style={{ backgroundImage: `url(${backgroundImage})` }}>
        {/* Display the emblem or default football image as a background */}
      </div>
      <div className="p-6">
        <h1 className="text-2xl font-bold mb-2">{name}</h1>
        <p className="text-sm mt-2">Start Date: {startDate}</p>
        <p className="text-sm">End Date: {endDate}</p>
        <p className="text-sm">Match Day: {matchDay}</p>
      </div>
    </motion.div>
  );
}

export default FootballCard;
