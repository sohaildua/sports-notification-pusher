import React, { useEffect, useState } from 'react';

export function Football() {
    const [football, setFootball] = useState(null);
    const [error, setError] = useState(null);

    useEffect(() => {
        function loadFootball() {
            fetch("http://localhost:8080/football/leagues")
                .then((response) => {
                    if (!response.ok) {
                        throw new Error('Failed to fetch football data');
                    }
                    return response.json();
                })
                .then((data) => {
                    console.log("Type of data:", typeof data);
                    if (typeof data === 'object' && !Array.isArray(data)) {
                        setFootball(data);
                    } else {
                        throw new Error('Invalid data format. Expected an object.');
                    }
                    setError(null);
                })
                .catch((error) => {
                    console.error("Error fetching football data:", error);
                    setError('Failed to fetch football data. Please try again later.');
                });
        }

        loadFootball();
    }, []);

    console.log("Football data:", football);

    return (
        <div>
            <h1>Football Leagues</h1>
            {error ? (
                <p>{error}</p>
            ) : football ? (
                <div>
                    {/* Render football object data here */}
                    <p>Name: {football.filters.season}</p>
                    <p>Location: {football.location}</p>
                    {/* Add more rendering logic for football object properties */}
                </div>
            ) : (
                <p>Loading...</p>
            )}
        </div>
    );
}

export default Football;
